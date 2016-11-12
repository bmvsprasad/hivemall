/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package hivemall.tools.array;

import java.util.ArrayList;
import java.util.List;

import org.apache.hadoop.io.Text;
import org.junit.Assert;
import org.junit.Test;

public class ToStringArrayUDFTest {

    @Test
    public void testTextArrayInput() {
        List<Text> input = new ArrayList<Text>(2);
        input.add(new Text("1"));
        input.add(new Text("2"));

        ToStringArrayUDF udf = new ToStringArrayUDF();
        List<Text> output = udf.evaluate(input);

        Assert.assertSame(input, output);
    }

    @Test
    public void testTextArrayInputWithNullValue() {
        List<Text> input = new ArrayList<Text>(2);
        input.add(new Text("1"));
        input.add(null);
        input.add(new Text("2"));

        ToStringArrayUDF udf = new ToStringArrayUDF();
        List<Text> output = udf.evaluate(input);

        Assert.assertSame(input, output);
    }

}
