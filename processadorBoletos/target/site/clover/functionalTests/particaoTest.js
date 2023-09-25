var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":71,"id":132,"methods":[{"el":45,"sc":5,"sl":37},{"el":59,"sc":5,"sl":48},{"el":70,"sc":5,"sl":62}],"name":"particaoTest","sl":15}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_13":{"methods":[{"sl":48}],"name":"testErroListaVazia","pass":true,"statements":[{"sl":50},{"sl":52},{"sl":53},{"sl":55},{"sl":58}]},"test_6":{"methods":[{"sl":37}],"name":"testFaturaNaoPaga1","pass":true,"statements":[{"sl":40},{"sl":41},{"sl":43}]},"test_9":{"methods":[{"sl":62}],"name":"testFaturaPaga1","pass":true,"statements":[{"sl":65},{"sl":66},{"sl":68}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [6], [], [], [6], [6], [], [6], [], [], [], [], [13], [], [13], [], [13], [13], [], [13], [], [], [13], [], [], [], [9], [], [], [9], [9], [], [9], [], [], []]
