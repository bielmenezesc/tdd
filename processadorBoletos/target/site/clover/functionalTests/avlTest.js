var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":119,"id":106,"methods":[{"el":64,"sc":5,"sl":53},{"el":75,"sc":5,"sl":67},{"el":86,"sc":5,"sl":78},{"el":97,"sc":5,"sl":89},{"el":108,"sc":5,"sl":100},{"el":118,"sc":5,"sl":111}],"name":"avlTest","sl":15}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1":{"methods":[{"sl":100}],"name":"testFaturaNaoPaga2","pass":true,"statements":[{"sl":103},{"sl":104},{"sl":106}]},"test_10":{"methods":[{"sl":53}],"name":"testErroListaVazia","pass":true,"statements":[{"sl":55},{"sl":57},{"sl":58},{"sl":60},{"sl":63}]},"test_12":{"methods":[{"sl":89}],"name":"testFaturaPaga2","pass":true,"statements":[{"sl":92},{"sl":93},{"sl":95}]},"test_21":{"methods":[{"sl":78}],"name":"testFaturaPaga1","pass":true,"statements":[{"sl":81},{"sl":82},{"sl":84}]},"test_8":{"methods":[{"sl":67}],"name":"testFaturaNaoPaga1","pass":true,"statements":[{"sl":70},{"sl":71},{"sl":73}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [10], [], [10], [], [10], [10], [], [10], [], [], [10], [], [], [], [8], [], [], [8], [8], [], [8], [], [], [], [], [21], [], [], [21], [21], [], [21], [], [], [], [], [12], [], [], [12], [12], [], [12], [], [], [], [], [1], [], [], [1], [1], [], [1], [], [], [], [], [], [], [], [], [], [], [], [], []]
