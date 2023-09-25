var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":26,"id":25,"methods":[{"el":25,"sc":5,"sl":7}],"name":"Processador","sl":5}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1":{"methods":[{"sl":7}],"name":"testFaturaNaoPaga2","pass":true,"statements":[{"sl":8},{"sl":12},{"sl":13},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":22}]},"test_10":{"methods":[{"sl":7}],"name":"testErroListaVazia","pass":true,"statements":[{"sl":8},{"sl":9}]},"test_11":{"methods":[{"sl":7}],"name":"testErroListaVazia","pass":true,"statements":[{"sl":8},{"sl":9}]},"test_12":{"methods":[{"sl":7}],"name":"testFaturaPaga2","pass":true,"statements":[{"sl":8},{"sl":12},{"sl":13},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":22},{"sl":23}]},"test_13":{"methods":[{"sl":7}],"name":"testErroListaVazia","pass":true,"statements":[{"sl":8},{"sl":9}]},"test_16":{"methods":[{"sl":7}],"name":"testFaturaNaoPaga1","pass":true,"statements":[{"sl":8},{"sl":12},{"sl":13},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":22}]},"test_17":{"methods":[{"sl":7}],"name":"testFaturaPaga1","pass":true,"statements":[{"sl":8},{"sl":12},{"sl":13},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":22},{"sl":23}]},"test_18":{"methods":[{"sl":7}],"name":"testFaturaNaoPaga1","pass":true,"statements":[{"sl":8},{"sl":12},{"sl":13},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":22}]},"test_19":{"methods":[{"sl":7}],"name":"testFaturaPaga1","pass":true,"statements":[{"sl":8},{"sl":12},{"sl":13},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":22},{"sl":23}]},"test_2":{"methods":[{"sl":7}],"name":"testErroListaVazia","pass":true,"statements":[{"sl":8},{"sl":9}]},"test_20":{"methods":[{"sl":7}],"name":"testErroListaVazia","pass":true,"statements":[{"sl":8},{"sl":9}]},"test_21":{"methods":[{"sl":7}],"name":"testFaturaPaga1","pass":true,"statements":[{"sl":8},{"sl":12},{"sl":13},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":22},{"sl":23}]},"test_22":{"methods":[{"sl":7}],"name":"testFaturaPaga1","pass":true,"statements":[{"sl":8},{"sl":12},{"sl":13},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":22},{"sl":23}]},"test_3":{"methods":[{"sl":7}],"name":"testFaturaNaoPaga1","pass":true,"statements":[{"sl":8},{"sl":12},{"sl":13},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":22}]},"test_4":{"methods":[{"sl":7}],"name":"testErroListaVazia","pass":true,"statements":[{"sl":8},{"sl":9}]},"test_5":{"methods":[{"sl":7}],"name":"testFaturaNaoPaga","pass":true,"statements":[{"sl":8},{"sl":12},{"sl":13},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":22}]},"test_6":{"methods":[{"sl":7}],"name":"testFaturaNaoPaga1","pass":true,"statements":[{"sl":8},{"sl":12},{"sl":13},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":22}]},"test_7":{"methods":[{"sl":7}],"name":"testFaturaPaga","pass":true,"statements":[{"sl":8},{"sl":12},{"sl":13},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":22},{"sl":23}]},"test_8":{"methods":[{"sl":7}],"name":"testFaturaNaoPaga1","pass":true,"statements":[{"sl":8},{"sl":12},{"sl":13},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":22}]},"test_9":{"methods":[{"sl":7}],"name":"testFaturaPaga1","pass":true,"statements":[{"sl":8},{"sl":12},{"sl":13},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":22},{"sl":23}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [12, 10, 17, 7, 18, 22, 2, 9, 16, 20, 19, 13, 1, 4, 5, 6, 21, 11, 3, 8], [12, 10, 17, 7, 18, 22, 2, 9, 16, 20, 19, 13, 1, 4, 5, 6, 21, 11, 3, 8], [10, 2, 20, 13, 4, 11], [], [], [12, 17, 7, 18, 22, 9, 16, 19, 1, 5, 6, 21, 3, 8], [12, 17, 7, 18, 22, 9, 16, 19, 1, 5, 6, 21, 3, 8], [], [12, 17, 7, 18, 22, 9, 16, 19, 1, 5, 6, 21, 3, 8], [12, 17, 7, 18, 22, 9, 16, 19, 1, 5, 6, 21, 3, 8], [12, 17, 7, 18, 22, 9, 16, 19, 1, 5, 6, 21, 3, 8], [12, 17, 7, 18, 22, 9, 16, 19, 1, 5, 6, 21, 3, 8], [12, 17, 7, 18, 22, 9, 16, 19, 1, 5, 6, 21, 3, 8], [], [], [12, 17, 7, 18, 22, 9, 16, 19, 1, 5, 6, 21, 3, 8], [12, 17, 7, 22, 9, 19, 21], [], [], []]