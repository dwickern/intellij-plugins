/*
 * Copyright 2014 The authors
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.intellij.struts2.dom.struts;

import org.jetbrains.annotations.NotNull;

/**
 * Various basic and complex struts.xml highlighting tests.
 *
 * @author Yann C&eacute;bron
 */
public class StrutsHighlightingTest extends StrutsLightHighlightingTestCase {

  @Override
  @NotNull
  protected String getTestDataLocation() {
    return "strutsXml/highlighting";
  }

  public void testSimpleStruts() throws Throwable {
    performHighlightingTest("struts-simple.xml",
                            "MyAbstractClass.java", "MyClass.java",
                            "MyInterface.java", "MyInterfaceImpl.java");
  }

  public void testParam() throws Throwable {
    performHighlightingTest("struts-param.xml",
                            "MyClass.java", "MyNestedClass.java");
  }

  public void testConstants() throws Throwable {
    performHighlightingTest("struts-constants.xml");
  }

  public void testExceptionMapping() throws Throwable {
    performHighlightingTest("struts-exceptionmapping.xml",
                            "MyException.java", "MyInterface.java");
  }

  public void testInterceptorRef() throws Throwable {
    performHighlightingTest("struts-interceptor-ref.xml");
  }

  public void testStrutsDefault() throws Throwable {
    performHighlightingTest("struts-default.xml");
  }

  public void testStrutsDefault218() throws Throwable {
    performHighlightingTest("struts-default-2_1_8.xml");
  }

  public void testStrutsDefault231() throws Throwable {
    performHighlightingTest("struts-default-2_3_1.xml",
                            "MyClass.java");
  }

  public void testUnknownHandlerStack() throws Throwable {
    performHighlightingTest("struts-unknownhandlerstack.xml",
                            "MyClass.java");
  }

  public void testActionAllowedMethods() throws Throwable {
    performHighlightingTest("struts-action-allowedMethods.xml",
                            "MyClass.java");
  }

  public void testStrutsWithErrorsNotInFilesetNoHighlighting() throws Throwable {
    createStrutsFileSet("struts-default.xml");
    myFixture.testHighlighting(false, false, false, "struts-errors.xml");
  }
}