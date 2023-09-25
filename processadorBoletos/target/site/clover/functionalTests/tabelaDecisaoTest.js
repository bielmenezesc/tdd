var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":69,"id":146,"methods":[{"el":43,"sc":5,"sl":35},{"el":54,"sc":5,"sl":46},{"el":68,"sc":5,"sl":57}],"name":"tabelaDecisaoTest","sl":14}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_11":{"methods":[{"sl":57}],"name":"testErroListaVazia","pass":true,"statements":[{"sl":59},{"sl":61},{"sl":62},{"sl":64},{"sl":67}]},"test_17":{"methods":[{"sl":35}],"name":"testFaturaPaga1","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":41}]},"test_3":{"methods":[{"sl":46}],"name":"testFaturaNaoPaga1","pass":true,"statements":[{"sl":49},{"sl":50},{"sl":52}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [17], [], [], [17], [17], [], [17], [], [], [], [], [3], [], [], [3], [3], [], [3], [], [], [], [], [11], [], [11], [], [11], [11], [], [11], [], [], [11], [], []]
