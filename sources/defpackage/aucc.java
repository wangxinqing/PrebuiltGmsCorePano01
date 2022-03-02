package defpackage;

/* renamed from: aucc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aucc implements audv {
    public static final aucc a = new aucc();

    private aucc() {
    }

    public final boolean a(Class cls) {
        return aucj.class.isAssignableFrom(cls);
    }

    public final audu b(Class cls) {
        if (!aucj.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unsupported message type: ") : "Unsupported message type: ".concat(valueOf));
        }
        try {
            Class<? extends U> asSubclass = cls.asSubclass(aucj.class);
            aucj aucj = (aucj) aucj.V.get(asSubclass);
            if (aucj == null) {
                Class.forName(asSubclass.getName(), true, asSubclass.getClassLoader());
                aucj = (aucj) aucj.V.get(asSubclass);
            }
            if (aucj == null) {
                aucj = (aucj) ((aucj) aufp.a((Class) asSubclass)).c(6);
                if (aucj != null) {
                    aucj.V.put(asSubclass, aucj);
                } else {
                    throw new IllegalStateException();
                }
            }
            return (audu) aucj.c(3);
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Class initialization cannot fail.", e);
        } catch (Exception e2) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() == 0 ? new String("Unable to get message info for ") : "Unable to get message info for ".concat(valueOf2), e2);
        }
    }
}
