package defpackage;

/* renamed from: aubu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aubu {
    public static final aubt a = new aubt();
    private static final aubt b;

    static {
        aubt aubt;
        try {
            aubt = (aubt) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            aubt = null;
        }
        b = aubt;
    }

    static aubt a() {
        aubt aubt = b;
        if (aubt != null) {
            return aubt;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
