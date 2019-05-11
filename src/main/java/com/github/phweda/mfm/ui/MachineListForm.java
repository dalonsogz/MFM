package com.github.phweda.mfm.ui;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.RowSorterEvent;
import javax.swing.event.RowSorterListener;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MachineListForm {
  private JPanel pnlMachineListView;
  private JTextField txtSearch;
  private JPanel pnlSearch;
  private JScrollPane scpPane;
  private JTable machineListTable;
  private TableRowSorter<MachineListTableModel> mltms;

  public MachineListForm() {
    $$$setupUI$$$();
    txtSearch.getDocument().addDocumentListener(new DocumentListener() {
      public void changedUpdate(DocumentEvent e) {
        handleFilter();
      }

      public void removeUpdate(DocumentEvent e) {
        handleFilter();
      }

      public void insertUpdate(DocumentEvent e) {
        handleFilter();
      }

      public void handleFilter() {
        DefaultRowSorter sorter = (DefaultRowSorter) machineListTable.getRowSorter();
        sorter.setRowFilter(new RowFilter() {
          @Override
          public boolean include(Entry entry) {
            String value = (String) entry.getValue(0);
            return value.toLowerCase().contains(txtSearch.getText().toLowerCase());
          }
        });
      }
    });
  }

  public JPanel getPnlMachineListView() {
    return pnlMachineListView;
  }

  private void createUIComponents() {
    machineListTable = MachineListTable.getInstance();
  }

  /**
   * Method generated by IntelliJ IDEA GUI Designer
   * >>> IMPORTANT!! <<<
   * DO NOT edit this method OR call it in your code!
   *
   * @noinspection ALL
   */
  private void $$$setupUI$$$() {
    createUIComponents();
    pnlMachineListView = new JPanel();
    pnlMachineListView.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
    pnlSearch = new JPanel();
    pnlSearch.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
    pnlMachineListView.add(pnlSearch, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
    txtSearch = new JTextField();
    pnlSearch.add(txtSearch, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
    final JLabel label1 = new JLabel();
    label1.setText("Filter");
    pnlSearch.add(label1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    scpPane = new JScrollPane();
    pnlMachineListView.add(scpPane, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
    scpPane.setViewportView(machineListTable);
  }

  /**
   * @noinspection ALL
   */
  public JComponent $$$getRootComponent$$$() {
    return pnlMachineListView;
  }
}
