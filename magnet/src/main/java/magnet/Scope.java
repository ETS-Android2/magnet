/*
 * Copyright (C) 2018 Sergej Shafarenka, www.halfbit.de
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

package magnet;

import java.util.List;

public interface Scope {

    <T> T getOptional(Class<T> type);
    <T> T getOptional(Class<T> type, String classifier);

    <T> T getSingle(Class<T> type);
    <T> T getSingle(Class<T> type, String classifier);

    <T> List<T> getMany(Class<T> type);
    <T> List<T> getMany(Class<T> type, String classifier);

    <T> Scope bind(Class<T> type, T instance);
    <T> Scope bind(Class<T> type, T instance, String classifier);

    Scope createSubscope();

}