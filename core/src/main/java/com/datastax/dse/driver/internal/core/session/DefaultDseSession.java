/*
 * Copyright DataStax, Inc.
 *
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
package com.datastax.dse.driver.internal.core.session;

import com.datastax.dse.driver.api.core.DseSession;
import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.session.Session;
import com.datastax.oss.driver.internal.core.session.DefaultSession;
import com.datastax.oss.driver.internal.core.session.SessionWrapper;
import net.jcip.annotations.ThreadSafe;

/**
 * @deprecated DSE functionality is now exposed directly on {@link CqlSession}. This class is
 *     preserved for backward compatibility, but {@link DefaultSession} should be used instead.
 */
@ThreadSafe
@Deprecated
public class DefaultDseSession extends SessionWrapper implements DseSession {

  public DefaultDseSession(Session delegate) {
    super(delegate);
  }
}