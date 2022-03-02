package defpackage;

import android.content.ContentValues;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;

/* renamed from: xfa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xfa extends xex {
    /* access modifiers changed from: protected */
    public final int a() {
        return 4;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void b(ContentValues contentValues, Object obj) {
        Person.Urls urls = (Person.Urls) obj;
    }

    /* access modifiers changed from: protected */
    public final void b(wmn wmn) {
    }

    public xfa(xfb xfb) {
        super(xfb);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ String a(Object obj) {
        return ((Person.Urls) obj).e;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ContentValues contentValues, Object obj) {
        contentValues.put("value", ((Person.Urls) obj).e);
    }

    /* access modifiers changed from: protected */
    public final void a(wmn wmn) {
        wmn.s++;
    }
}
