/**
 * @License
 * Copyright 2020 Bubble Sort Application
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

package edu.ifrs.vvs;

/**
 * Heap Sort App.
 */
public final class App {

    private App() {

    }

    /**
     * Sorts the array.
     *
     * @param args The arguments of the program
     */
    // Driver code
    public static void main(String[] args) {
        HeapSort heapsort = new HeapSort();
        int[] v = heapsort.read();

        HeapSort ob = new HeapSort();
        heapsort.sort(v);

        System.out.println("Array ordenado:");
        ob.printArray(v);
    }
}
