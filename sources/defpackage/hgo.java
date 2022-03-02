package defpackage;

/* renamed from: hgo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hgo extends Exception {
    public final int a;

    public hgo() {
        this.a = 5;
    }

    public final String getMessage() {
        String str;
        int i = this.a;
        switch (i) {
            case 1:
                str = "CONFIG_ERROR";
                break;
            case 2:
                str = "SYNC_ERROR";
                break;
            case 3:
                str = "SYNC_TIMEOUT";
                break;
            case 4:
                str = "COMMIT_ERROR";
                break;
            case 5:
                str = "COMMIT_TIMEOUT";
                break;
            case 6:
                str = "BAD_FLAG_PROTO";
                break;
            default:
                str = "null";
                break;
        }
        if (i != 0) {
            String message = super.getMessage();
            if (message == null) {
                return str;
            }
            StringBuilder sb = new StringBuilder(str.length() + 2 + message.length());
            sb.append(str);
            sb.append(", ");
            sb.append(message);
            return sb.toString();
        }
        throw null;
    }

    public hgo(int i, Exception exc) {
        super(exc);
        this.a = i;
    }

    public hgo(String str) {
        super(str);
        this.a = 1;
    }
}
