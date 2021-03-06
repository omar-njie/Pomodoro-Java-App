package App;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Timer extends JFrame implements
        Runnable, ActionListener {

    private JPanel main_panel;
    private JTabbedPane main_tabbed_pane;
    private JPanel pomodoro_tab;
    private JPanel short_break_tab;
    private JPanel long_break_tab;
    private JLabel pomodoro_label;
    private JLabel timer_label;
    private JButton start_button;
    private JButton next_button;
    private JLabel short_break_label;
    private JButton tab2_start_button;
    private JLabel short_timer_label;
    private JButton stop_button;
    private JButton tab2_stop_button;
    private JLabel long_break_label;
    private JLabel long_timer_label;
    private JButton tab3_start_button;
    private JButton tab3_stop_button;

    private final JMenuBar menu_bar = new JMenuBar();
    private final JMenu edit_menu = new JMenu("Edit");
    private final JMenu reset = new JMenu("Reset");
    private final JMenuItem reset_pomodoro = new JMenuItem("Reset Pomodoro");
    private final JMenuItem about = new JMenuItem("About");
    private final JMenuItem exit = new JMenuItem("Exit");

    public Timer() {
        run();
    }

    @Override
    public void run() {
        this.setTitle("Pomodoro Timer");
        this.setContentPane(main_panel);
        this.setSize(553, 380);
        this.setJMenuBar(menu_bar);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(true);
        this.setLocationRelativeTo(null);

        Font font = new Font("JetBrainsMono Nerd Font", Font.BOLD, 18);

        edit_menu.setFont(new Font("FiraCode Nerd Font", Font.BOLD, 18));
        reset.setFont(new Font("FiraCode Nerd Font", Font.BOLD, 18));
        about.setFont(font);
        exit.setFont(font);
        reset_pomodoro.setFont(font);

        menu_bar.add(edit_menu);
        menu_bar.add(reset);

        edit_menu.add(about);
        // separator
        edit_menu.addSeparator();
        edit_menu.add(exit);
        reset.add(reset_pomodoro);

        main_tabbed_pane.addTab("Pomodoro", pomodoro_tab);
        main_tabbed_pane.addTab("Short Break", short_break_tab);
        main_tabbed_pane.addTab("Long Break", long_break_tab);

        TAB1:
        pomodoro_label.setText("Pomodoro");
        timer_label.setText("25:00");
        start_button.setText("Start");
        stop_button.setText("Stop");
        start_button.putClientProperty("JButton.buttonType", "roundRect");
        stop_button.putClientProperty("JButton.buttonType", "roundRect");
        next_button.putClientProperty("JButton.buttonType", "roundRect");
        next_button.setToolTipText("<html><h2>Next</h2></html>");

        TAB2:
        short_break_label.setText("Short Break");
        short_timer_label.setText("5:00");
        tab2_start_button.setText("Start");
        tab2_stop_button.setText("Stop");
        tab2_start_button.putClientProperty("JButton.buttonType", "roundRect");
        tab2_stop_button.putClientProperty("JButton.buttonType", "roundRect");

        TAB3:
        long_break_label.setText("Long Break");
        long_timer_label.setText("15:00");
        tab3_start_button.setText("Start");
        tab3_stop_button.setText("Stop");
        tab3_start_button.putClientProperty("JButton.buttonType", "roundRect");
        tab3_stop_button.putClientProperty("JButton.buttonType", "roundRect");

        exit.addActionListener(this);
        reset_pomodoro.addActionListener(this);
        start_button.addActionListener(this);
        stop_button.addActionListener(this);
        next_button.addActionListener(this);
    }

    public static void start() {

    }

    public static void stop() {

    }

    public void next() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exit) {
            System.exit(0);
        }

        if (e.getSource() == reset_pomodoro) {
            System.out.println("Reset");
            // countdown

        }

        if (e.getSource() == start_button) {
            System.out.println("Start");
        }


     /*   if (e.getSource() == next_button) {
            // open the tab each time the next button is clicked
            NEXT:
            if (main_tabbed_pane.getSelectedIndex() == 0) {
                main_tabbed_pane.setSelectedIndex(1);
            }

            PREVIOUS:
            for (int i = 0; i < main_tabbed_pane.getTabCount(); i++) {
                main_tabbed_pane.setSelectedIndex(i);
                if (main_tabbed_pane.getTitleAt(i).equals("Pomodoro")) {
                    main_tabbed_pane.setSelectedIndex(i);
                    break PREVIOUS;

                }
            }
        }*/
    }

}
