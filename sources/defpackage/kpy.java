package defpackage;

/* renamed from: kpy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum kpy {
    UNTRASHED(0),
    IMPLICITLY_TRASHED(1),
    EXPLICITLY_TRASHED(2);
    
    public final long d;

    private kpy(long j) {
        this.d = j;
    }

    public static kpy a(long j) {
        for (kpy kpy : values()) {
            if (kpy.d == j) {
                return kpy;
            }
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("Unaccepted TrashState sql value ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean b() {
        return UNTRASHED.equals(this);
    }

    public static kpy a(boolean z, boolean z2) {
        if (z && !z2) {
            throw new IllegalArgumentException("Cannot be explicitly trashed and untrashed");
        } else if (z) {
            return EXPLICITLY_TRASHED;
        } else {
            return !z2 ? UNTRASHED : IMPLICITLY_TRASHED;
        }
    }

    public final boolean a() {
        return EXPLICITLY_TRASHED.equals(this);
    }
}
