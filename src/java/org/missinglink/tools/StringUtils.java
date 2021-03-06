/*
 * Copyright 2012 the original author or authors.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.missinglink.tools;

public abstract class StringUtils {

  protected StringUtils() {
    super();
  }

  /**
   * If in is null or length 0, return defaultString, otherwise return in
   * 
   * @param in
   * @param defaultString
   * @return The String
   * 
   *         <pre>
   * in
   * </pre>
   * 
   *         if it is not null or empty, otherwise the value of
   * 
   *         <pre>
   * defaultString
   * </pre>
   */
  public static String defaultString(final String in, final String defaultString) {
    return null == in || in.length() == 0 ? defaultString : in;
  }

}
