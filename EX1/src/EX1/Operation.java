package EX1;

/** This enum presents the set of operations applicable on EX1.function to compose a complex EX1.function from two EX1.functions.
     * E.g.,   Plus: plus(f1(x), f2(x)),  Times: mul(f1(x), f2(x)), Divid: div(f1(x), f2(x)), Max: max(f1(x), f2(x)), Min: min(f1(x), f2(x)), Comp: comp(f1(x), f2(x)) == f1(f2(x))
     * None representing no EX1.Operation and Error representing an unknown (aka unsupported) EX1.Operation.
     * @author boaz_benmoshe
     *
     */
    public enum Operation {
        Plus, Times, Divid, Max, Min, Comp , None, Error
    }

