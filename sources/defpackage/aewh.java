package defpackage;

/* renamed from: aewh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aewh {
    public static void a(auky auky) {
        auky auky2 = auky.UNKNOWN;
        if (auky.ordinal() != 1) {
            String valueOf = String.valueOf(auky);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51);
            sb.append("Don't know what local Footprints change type ");
            sb.append(valueOf);
            sb.append(" means");
            throw new UnsupportedOperationException(sb.toString());
        }
    }
}
