package defpackage;

/* renamed from: amkd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amkd extends IllegalStateException {
    public amkd(String str) {
        super(a((String) null, str));
    }

    private static String a(String str, String str2) {
        String str3 = str != null ? str.length() == 0 ? new String(": ") : ": ".concat(str) : "";
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 131 + String.valueOf(str3).length());
        sb.append("Starting new trace ");
        sb.append(str2);
        sb.append(" when already associated with a trace");
        sb.append(str3);
        sb.append(". For more help, see http://go/tiktok-tracing#fixing-duplicate-trace-issues");
        return sb.toString();
    }

    public amkd(String str, String str2, Throwable th) {
        super(a(str, str2), th);
    }
}
