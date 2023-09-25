var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":46,"id":52,"methods":[{"el":35,"sc":5,"sl":27},{"el":45,"sc":5,"sl":37}],"name":"ProcessadorTest","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_5":{"methods":[{"sl":37}],"name":"testFaturaNaoPaga","pass":true,"statements":[{"sl":40},{"sl":41},{"sl":43}]},"test_7":{"methods":[{"sl":27}],"name":"testFaturaPaga","pass":true,"statements":[{"sl":30},{"sl":31},{"sl":33}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [7], [], [], [7], [7], [], [7], [], [], [], [5], [], [], [5], [5], [], [5], [], [], []]
