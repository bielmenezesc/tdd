var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":35,"id":6,"methods":[{"el":17,"sc":5,"sl":12},{"el":21,"sc":5,"sl":19},{"el":25,"sc":5,"sl":23},{"el":29,"sc":5,"sl":27},{"el":33,"sc":5,"sl":31}],"name":"Fatura","sl":5}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":12}],"name":"testPagamento","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":15},{"sl":16}]},"test_1":{"methods":[{"sl":23},{"sl":27},{"sl":31}],"name":"testFaturaNaoPaga2","pass":true,"statements":[{"sl":24},{"sl":28},{"sl":32}]},"test_12":{"methods":[{"sl":19},{"sl":23},{"sl":27},{"sl":31}],"name":"testFaturaPaga2","pass":true,"statements":[{"sl":20},{"sl":24},{"sl":28},{"sl":32}]},"test_15":{"methods":[{"sl":12}],"name":"testFatura","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":15},{"sl":16}]},"test_16":{"methods":[{"sl":23},{"sl":27},{"sl":31}],"name":"testFaturaNaoPaga1","pass":true,"statements":[{"sl":24},{"sl":28},{"sl":32}]},"test_17":{"methods":[{"sl":19},{"sl":23},{"sl":27},{"sl":31}],"name":"testFaturaPaga1","pass":true,"statements":[{"sl":20},{"sl":24},{"sl":28},{"sl":32}]},"test_18":{"methods":[{"sl":23},{"sl":27},{"sl":31}],"name":"testFaturaNaoPaga1","pass":true,"statements":[{"sl":24},{"sl":28},{"sl":32}]},"test_19":{"methods":[{"sl":19},{"sl":23},{"sl":27},{"sl":31}],"name":"testFaturaPaga1","pass":true,"statements":[{"sl":20},{"sl":24},{"sl":28},{"sl":32}]},"test_21":{"methods":[{"sl":19},{"sl":23},{"sl":27},{"sl":31}],"name":"testFaturaPaga1","pass":true,"statements":[{"sl":20},{"sl":24},{"sl":28},{"sl":32}]},"test_22":{"methods":[{"sl":19},{"sl":23},{"sl":27},{"sl":31}],"name":"testFaturaPaga1","pass":true,"statements":[{"sl":20},{"sl":24},{"sl":28},{"sl":32}]},"test_3":{"methods":[{"sl":23},{"sl":27},{"sl":31}],"name":"testFaturaNaoPaga1","pass":true,"statements":[{"sl":24},{"sl":28},{"sl":32}]},"test_5":{"methods":[{"sl":23},{"sl":27},{"sl":31}],"name":"testFaturaNaoPaga","pass":true,"statements":[{"sl":24},{"sl":28},{"sl":32}]},"test_6":{"methods":[{"sl":23},{"sl":27},{"sl":31}],"name":"testFaturaNaoPaga1","pass":true,"statements":[{"sl":24},{"sl":28},{"sl":32}]},"test_7":{"methods":[{"sl":19},{"sl":23},{"sl":27},{"sl":31}],"name":"testFaturaPaga","pass":true,"statements":[{"sl":20},{"sl":24},{"sl":28},{"sl":32}]},"test_8":{"methods":[{"sl":23},{"sl":27},{"sl":31}],"name":"testFaturaNaoPaga1","pass":true,"statements":[{"sl":24},{"sl":28},{"sl":32}]},"test_9":{"methods":[{"sl":19},{"sl":23},{"sl":27},{"sl":31}],"name":"testFaturaPaga1","pass":true,"statements":[{"sl":20},{"sl":24},{"sl":28},{"sl":32}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [0, 15], [0, 15], [0, 15], [0, 15], [0, 15], [], [], [12, 17, 7, 22, 9, 19, 21], [12, 17, 7, 22, 9, 19, 21], [], [], [12, 17, 7, 18, 22, 9, 16, 19, 1, 5, 6, 21, 3, 8], [12, 17, 7, 18, 22, 9, 16, 19, 1, 5, 6, 21, 3, 8], [], [], [12, 17, 7, 18, 22, 9, 16, 19, 1, 5, 6, 21, 3, 8], [12, 17, 7, 18, 22, 9, 16, 19, 1, 5, 6, 21, 3, 8], [], [], [12, 17, 7, 18, 22, 9, 16, 19, 1, 5, 6, 21, 3, 8], [12, 17, 7, 18, 22, 9, 16, 19, 1, 5, 6, 21, 3, 8], [], [], []]
