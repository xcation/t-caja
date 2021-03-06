// Copyright (C) 2010 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.caja.service;

import com.google.caja.util.CajaTestCase;

/**
 * @author ihab.awad@google.com (Ihab Awad)
 */
public class AbstractCajolingHandlerTest extends CajaTestCase {

  public void testCheckIdentifier() throws Exception {
    assertTrue(AbstractCajolingHandler.checkIdentifier("f"));
    assertTrue(AbstractCajolingHandler.checkIdentifier("f$_"));

    assertFalse(AbstractCajolingHandler.checkIdentifier("1"));
    assertFalse(AbstractCajolingHandler.checkIdentifier("1a"));
    assertFalse(AbstractCajolingHandler.checkIdentifier("a b"));
    assertFalse(AbstractCajolingHandler.checkIdentifier("a,b"));
    assertFalse(AbstractCajolingHandler.checkIdentifier("a=0,b"));
    assertFalse(AbstractCajolingHandler.checkIdentifier("a(b)"));
  }
}
