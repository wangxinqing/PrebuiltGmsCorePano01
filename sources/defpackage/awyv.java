package defpackage;

/* renamed from: awyv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awyv implements awyq {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw a2 = new agvw("direct_boot:gms_chimera_phenotype_flags").a();
        agvx.a(a2, "CpuProfiling__enable_profiling", false);
        try {
            agvx.a(a2, "Primes__primes_profiling_default_process_config", (acvd) aucj.a((aucj) acvd.g, new byte[]{10, 38, 112, 114, 111, 99, 101, 115, 115, 95, 110, 97, 109, 101, 95, 105, 103, 110, 111, 114, 101, 100, 95, 102, 111, 114, 95, 100, 101, 102, 97, 117, 108, 116, 95, 118, 97, 108, 117, 101, 16, -104, 117, 24, -24, 7, 32, 5, 40, Byte.MIN_VALUE, -96, 31, 48, -72, 23}), awyr.a);
            try {
                agvx.a(a2, "Primes__primes_profiling_process_configs", (acve) aucj.a((aucj) acve.b, new byte[]{10, 50, 10, 33, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 103, 109, 115, 46, 112, 101, 114, 115, 105, 115, 116, 101, 110, 116, 16, -104, 117, 24, -24, 7, 32, 1, 40, Byte.MIN_VALUE, -96, 31, 48, -72, 23}), awys.a);
                try {
                    a = agvx.a(a2, "CpuProfiling__primes_profiling_default_process_config", (acvd) aucj.a((aucj) acvd.g, new byte[]{10, 38, 112, 114, 111, 99, 101, 115, 115, 95, 110, 97, 109, 101, 95, 105, 103, 110, 111, 114, 101, 100, 95, 102, 111, 114, 95, 100, 101, 102, 97, 117, 108, 116, 95, 118, 97, 108, 117, 101, 16, -104, 117, 24, -24, 7, 32, 5, 40, Byte.MIN_VALUE, -96, 31, 48, -72, 23}), awyt.a);
                    try {
                        b = agvx.a(a2, "CpuProfiling__primes_profiling_process_configs", (acve) aucj.a((aucj) acve.b, new byte[]{10, 50, 10, 33, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 103, 109, 115, 46, 112, 101, 114, 115, 105, 115, 116, 101, 110, 116, 16, -104, 117, 24, -24, 7, 32, 1, 40, Byte.MIN_VALUE, -96, 31, 48, -72, 23}), awyu.a);
                    } catch (auda e) {
                        throw new AssertionError("Could not parse proto flag \"CpuProfiling__primes_profiling_process_configs\"");
                    }
                } catch (auda e2) {
                    throw new AssertionError("Could not parse proto flag \"CpuProfiling__primes_profiling_default_process_config\"");
                }
            } catch (auda e3) {
                throw new AssertionError("Could not parse proto flag \"Primes__primes_profiling_process_configs\"");
            }
        } catch (auda e4) {
            throw new AssertionError("Could not parse proto flag \"Primes__primes_profiling_default_process_config\"");
        }
    }

    public final acvd a() {
        return (acvd) a.c();
    }

    public final acve b() {
        return (acve) b.c();
    }
}
