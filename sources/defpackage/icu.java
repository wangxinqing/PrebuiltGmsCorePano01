package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: icu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class icu extends icy {
    protected final idf a;

    public icu(int i, idf idf) {
        super(i);
        this.a = idf;
    }

    public final void a(Status status) {
        this.a.a(status);
    }

    public final void b(ifj ifj) {
        try {
            this.a.b(ifj.b);
        } catch (RuntimeException e) {
            a((Exception) e);
        }
    }

    public final void a(ied ied, boolean z) {
        idf idf = this.a;
        ied.a.put(idf, Boolean.valueOf(z));
        idf.a((ice) new ieb(ied, idf));
    }

    public final void a(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        this.a.a(new Status(10, sb.toString()));
    }
}
