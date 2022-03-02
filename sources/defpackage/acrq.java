package defpackage;

/* renamed from: acrq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acrq extends qxc {
    public final void a(int i) {
        StringBuilder sb = new StringBuilder("RequestCollector finished with status: ");
        if (i != 2) {
            sb.append("RESULT SUCCESS");
        } else {
            sb.append("RESULT FAILURE");
        }
    }
}
