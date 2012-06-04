package com.google.jstestdriver.idea.execution.tree;

import org.jetbrains.annotations.NotNull;

/**
 * @author Sergey Simonchik
 */
public class BrowserNode extends AbstractSuiteNode<TestCaseNode> {
  public BrowserNode(@NotNull String name, @NotNull ConfigNode parent) {
    super(name, parent);
  }
}
