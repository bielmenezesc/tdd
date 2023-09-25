var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":75,"id":78,"methods":[{"el":47,"sc":5,"sl":38},{"el":62,"sc":5,"sl":50},{"el":74,"sc":5,"sl":65}],"name":"particaoTest","sl":16}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_16":{"methods":[{"sl":38}],"name":"testFaturaNaoPaga1","pass":true,"statements":[{"sl":42},{"sl":43},{"sl":45}]},"test_22":{"methods":[{"sl":65}],"name":"testFaturaPaga1","pass":true,"statements":[{"sl":69},{"sl":70},{"sl":72}]},"test_4":{"methods":[{"sl":50}],"name":"testErroListaVazia","pass":true,"statements":[{"sl":53},{"sl":55},{"sl":56},{"sl":58},{"sl":61}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [16], [], [], [], [16], [16], [], [16], [], [], [], [], [4], [], [], [4], [], [4], [4], [], [4], [], [], [4], [], [], [], [22], [], [], [], [22], [22], [], [22], [], [], []]
