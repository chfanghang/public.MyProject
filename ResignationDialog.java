import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class ResignationDialog {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // 构建辞职申请内容
                String content = "辞职申请书\n" +
                        "尊敬的xx总：\n" +
                        "您好！我是xx，在xxxx部担任xx。写下这封信，是想正式向您提出辞职申请，我的最后工作日拟定为2025-3-9，希望能得到您的理解与批准。\n" +
                        "入职以来，我收获颇丰。团队协作的氛围让我感受到了集体的力量，公司完善的培训体系帮助我不断提升专业技能，领导的悉心指导也让我在工作中少走了许多弯路。在这里，我参与了多个重要项目，每一次攻克难题、取得成果，都让我充满成就感。这些经历不仅丰富了我的工作经验，更成为我职业生涯中的宝贵财富。\n" +
                        "然而，经过深思熟虑，我决定离开。个人职业发展规划与公司目前的业务方向出现了一定偏差。我一直对xx有着浓厚的兴趣，并希望能在这个方向深入发展，积累更多专业知识和经验。近期，我得到了一个与该方向契合的发展机会，经过权衡，我认为这是一个难得的机遇，能够帮助我实现职业目标，所以决定把握这次机会。\n" +
                        "在接下来到离职前的这段时间，我会尽最大努力确保手头工作的平稳交接。我会整理好相关工作资料，详细记录工作流程和进展情况，与接手同事充分沟通，保证工作的顺利过渡，将对公司业务的影响降到最低。\n" +
                        "最后，衷心感谢公司给予我的机会与平台，让我得以成长与进步。也感谢领导和同事们在工作中对我的支持与帮助。祝愿公司未来蒸蒸日上，取得更加辉煌的成绩。\n" +
                        "此致\n" +
                        "敬礼！\n" +
                        "xx\n" +
                        "2025-3-9\n";

                // 创建主对话框
                JDialog dialog = new JDialog();
                dialog.setTitle("辞职申请");
                dialog.setSize(400, 300);
                // 禁用默认的关闭操作
                dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                dialog.setLayout(new BorderLayout());

                // 创建显示文本的标签
                JLabel messageLabel = new JLabel("<html><body style='width:360px'>" + content.replace("\n", "<br>") + "</body></html>", SwingConstants.CENTER);
                messageLabel.setFont(new Font("宋体", Font.PLAIN, 14));

                // 创建滚动面板
                JScrollPane scrollPane = new JScrollPane(messageLabel);
                scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

                // 创建按钮面板
                JPanel buttonPanel = new JPanel();
                buttonPanel.setLayout(new FlowLayout());

                // 创建提交按钮，初始不可用
                JButton submitButton = new JButton("同意");
                submitButton.setEnabled(false);
                submitButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(dialog, "辞职申请已提交。", "提示", JOptionPane.INFORMATION_MESSAGE);
                        dialog.dispose();
                    }
                });

                // 创建取消按钮
                JButton cancelButton = new JButton("取消");
                cancelButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dialog.dispose();
                        // 弹出新的确认对话框
                        showShutdownConfirmationDialog();
                    }
                });

                // 将按钮添加到按钮面板
                buttonPanel.add(submitButton);
                buttonPanel.add(cancelButton);

                // 监听滚动条事件，当滚动到最底部时启用提交按钮
                scrollPane.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener() {
                    @Override
                    public void adjustmentValueChanged(AdjustmentEvent e) {
                        JScrollBar scrollBar = (JScrollBar) e.getSource();
                        if (scrollBar.getValue() + scrollBar.getVisibleAmount() >= scrollBar.getMaximum()) {
                            submitButton.setEnabled(true);
                        }
                    }
                });

                // 监听窗口关闭事件
                dialog.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        showReminderDialog(dialog);
                    }
                });

                // 将滚动面板添加到对话框中部
                dialog.add(scrollPane, BorderLayout.CENTER);
                // 将按钮面板添加到对话框底部
                dialog.add(buttonPanel, BorderLayout.SOUTH);

                // 让对话框居中显示
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);
            }
        });
    }

    private static void showReminderDialog(JDialog parentDialog) {
        JDialog reminderDialog = new JDialog(parentDialog, "提醒", true);
        reminderDialog.setSize(300, 150);
        reminderDialog.setLayout(new BorderLayout());
        // 禁用默认的关闭操作
        reminderDialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);

        JLabel reminderLabel = new JLabel("领导，你要同意才行", SwingConstants.CENTER);
        reminderLabel.setFont(new Font("宋体", Font.PLAIN, 16));

        JButton backButton = new JButton("返回");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reminderDialog.dispose();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(backButton);

        reminderDialog.add(reminderLabel, BorderLayout.CENTER);
        reminderDialog.add(buttonPanel, BorderLayout.SOUTH);

        // 监听窗口关闭事件
        reminderDialog.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                showReminderDialog(reminderDialog);
            }
        });

        reminderDialog.setLocationRelativeTo(parentDialog);
        reminderDialog.setVisible(true);
    }

    private static void showShutdownConfirmationDialog() {
        // 创建新的对话框
        JDialog confirmationDialog = new JDialog();
        confirmationDialog.setTitle("确认操作");
        confirmationDialog.setSize(300, 150);
        // 禁用默认的关闭操作
        confirmationDialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        confirmationDialog.setLayout(new BorderLayout());

        // 创建提示信息标签
        JLabel confirmMessageLabel = new JLabel("如果不同意就关机。", SwingConstants.CENTER);
        confirmMessageLabel.setFont(new Font("宋体", Font.PLAIN, 16));

        // 创建按钮面板
        JPanel confirmButtonPanel = new JPanel();
        confirmButtonPanel.setLayout(new FlowLayout());

        // 创建同意按钮
        JButton agreeButton = new JButton("同意");
        agreeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(confirmationDialog, "辞职申请已提交。", "提示", JOptionPane.INFORMATION_MESSAGE);
                confirmationDialog.dispose();
            }
        });

        // 创建不同意按钮
        JButton disagreeButton = new JButton("不同意");
        disagreeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // 执行关机命令
                    if (System.getProperty("os.name").contains("Windows")) {
                        Runtime.getRuntime().exec("shutdown -s -t 0");
                    } else if (System.getProperty("os.name").contains("Linux") || System.getProperty("os.name").contains("Mac")) {
                        Runtime.getRuntime().exec("shutdown -h now");
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                confirmationDialog.dispose();
            }
        });

        // 将按钮添加到按钮面板
        confirmButtonPanel.add(agreeButton);
        confirmButtonPanel.add(disagreeButton);

        // 将标签添加到对话框中部
        confirmationDialog.add(confirmMessageLabel, BorderLayout.CENTER);
        // 将按钮面板添加到对话框底部
        confirmationDialog.add(confirmButtonPanel, BorderLayout.SOUTH);

        // 监听窗口关闭事件
        confirmationDialog.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                showReminderDialog(confirmationDialog);
            }
        });

        // 让对话框居中显示
        confirmationDialog.setLocationRelativeTo(null);
        confirmationDialog.setVisible(true);
    }
}