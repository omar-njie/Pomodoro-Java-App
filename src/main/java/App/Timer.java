package App;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Timer extends JFrame implements Runnable, ActionListener {

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
    private JButton tab2_button;
    private JLabel short_timer_label;

    public Timer() {
        run();
    }

    @Override
    public void run() {
        this.setTitle("Pomodoro Timer");
        setContentPane(main_panel);
        this.setSize(553, 380);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(true);
        this.setLocationRelativeTo(null);

        main_tabbed_pane.addTab("Pomodoro", pomodoro_tab);
        main_tabbed_pane.addTab("Short Break", short_break_tab);
        main_tabbed_pane.addTab("Long Break", long_break_tab);
        pomodoro_label.setText("Pomodoro");
        timer_label.setText("25:00");
        start_button.setText("Start");
        start_button.putClientProperty("JButton.buttonType", "roundRect");
        next_button.putClientProperty("JButton.buttonType", "roundRect");
        next_button.setToolTipText("<html><h2>Next</h2></html>");

        short_break_label.setText("Short Break");
        short_timer_label.setText("5:00");
        tab2_button.setText("Start");
        tab2_button.putClientProperty("JButton.buttonType", "roundRect");

        start_button.addActionListener(this);
        next_button.addActionListener(this);
    }

    public static void start() {

    }

    public static void stop() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start_button) {
            start_button.setText("Stop");
            next_button.setVisible(true);
        }

        /*if (e.getSource() == start_button) {
            start_button.setText("Start");
            next_button.setVisible(false);
        }*/
    }
}
