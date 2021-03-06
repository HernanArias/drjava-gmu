/*BEGIN_COPYRIGHT_BLOCK
 *
 * Copyright (c) 2001-2008, JavaPLT group at Rice University (drjava@rice.edu)
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *    * Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.
 *    * Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *    * Neither the names of DrJava, the JavaPLT group, Rice University, nor the
 *      names of its contributors may be used to endorse or promote products
 *      derived from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * This software is Open Source Initiative approved Open Source Software.
 * Open Source Initative Approved is a trademark of the Open Source Initiative.
 * 
 * This file is part of DrJava.  Download the current version of this project
 * from http://www.drjava.org/ or http://sourceforge.net/projects/drjava/
 * 
 * END_COPYRIGHT_BLOCK*/

package edu.rice.cs.drjava;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * This interface hold the information about this build of DrJava.
 * This file is copied to Version.java by the build process, which also
 * fills in the right values of the date and time.
 *
 * This javadoc corresponds to build drjava-20160606-r5763;
 *
 * @version $Id: Version.orig 4571 2008-07-10 22:45:33Z dlsmith $
 */
public abstract class Version {

  /**
   * This string will be automatically expanded upon "ant commit".
   * Do not edit it by hand!
   */
  private static final String VERSION_STRING = "drjava-20160606-r5763";

  /**
   * This string will be automatically expanded upon "ant commit".
   * Do not edit it by hand!
   */
  private static final String BUILD_TIME_STRING = "20160606-1318";

  /** A {@link Date} version of the build time. */
  private static final Date BUILD_TIME = _getBuildDate();

  /**
   * This string will be automatically expanded upon "ant commit.".
   * Do not edit it by hand!
   */
  private static final String REVISION_STRING = "5763";

  public static String getVersionString() {
    return VERSION_STRING;
  }

  public static int getRevisionNumber() {
    return new Integer(REVISION_STRING);
  }

  public static String getBuildTimeString() {
    return BUILD_TIME_STRING;
  }

  public static Date getBuildTime() {
    return BUILD_TIME;
  }

  private static Date _getBuildDate() {
    try {
      return new SimpleDateFormat("yyyyMMdd-HHmm z").parse(BUILD_TIME_STRING + " GMT");
    }
    catch (Exception e) { // parse format or whatever problem
      return null;
    }
  }

  public static void main(String[] args) {
    System.out.println("Version for edu.rice.cs.drjava: " + VERSION_STRING);
  }
} 
