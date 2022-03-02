package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;

/* renamed from: wxs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wxs implements ilh {
    final /* synthetic */ idf a;
    final /* synthetic */ wxw b;
    final /* synthetic */ wxj c;

    public wxs(wxw wxw, wxj wxj, idf idf) {
        this.b = wxw;
        this.c = wxj;
        this.a = idf;
    }

    public final int a() {
        return this.c.a();
    }

    public final Bundle b() {
        return null;
    }

    public final void c() {
        idf idf = this.a;
        if (idf != null) {
            idf.b();
        }
        for (DataHolder close : this.b.b) {
            close.close();
        }
    }

    public final void close() {
        c();
    }

    public final Iterator iterator() {
        return new ili(this);
    }

    public final Object a(int i) {
        return this.c.a(i);
    }
}
