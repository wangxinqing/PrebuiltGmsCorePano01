package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;

/* renamed from: ile  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ile implements ilh {
    public final DataHolder a;

    protected ile(DataHolder dataHolder) {
        this.a = dataHolder;
    }

    public int a() {
        DataHolder dataHolder = this.a;
        if (dataHolder != null) {
            return dataHolder.h;
        }
        return 0;
    }

    public abstract Object a(int i);

    public final Bundle b() {
        return this.a.f;
    }

    public void c() {
        DataHolder dataHolder = this.a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    public final void close() {
        c();
    }

    public final Iterator iterator() {
        return new ili(this);
    }
}
