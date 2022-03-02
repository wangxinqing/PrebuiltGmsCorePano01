package defpackage;

import android.accounts.Account;

/* renamed from: exs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class exs implements agaf, agcm {
    final /* synthetic */ ext a;

    public exs(ext ext) {
        this.a = ext;
    }

    public final CharSequence a() {
        return ((Account) this.a.a.h.b()).name;
    }

    public final /* bridge */ /* synthetic */ CharSequence b(Object obj) {
        eze eze = (eze) obj;
        return a();
    }

    public final /* bridge */ /* synthetic */ CharSequence c(Object obj) {
        eze eze = (eze) obj;
        return a();
    }

    public final /* bridge */ /* synthetic */ String a(Object obj) {
        eze eze = (eze) obj;
        eze eze2 = this.a.a;
        String str = eze2.c;
        int hashCode = ((Account) eze2.h.b()).hashCode();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
        sb.append(str);
        sb.append(hashCode);
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, int i, agcl agcl) {
        agcl.a(((eze) obj).l);
    }
}
