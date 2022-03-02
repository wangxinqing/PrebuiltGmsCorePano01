package defpackage;

/* renamed from: aiou  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aiou extends aipi {
    private final long a;

    public aiou(ajrb ajrb, String str, long j) {
        super(ajrb, str);
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aiou) || !super.equals(obj) || this.a != ((aiou) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = super.hashCode();
        long j = this.a;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String aipi = super.toString();
        long j = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(aipi).length() + 36);
        sb.append(aipi);
        sb.append(" maxWaitMillis: ");
        sb.append(j);
        return sb.toString();
    }
}
