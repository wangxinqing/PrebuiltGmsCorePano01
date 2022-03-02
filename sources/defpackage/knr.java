package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.Collection;
import org.json.JSONException;

/* renamed from: knr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class knr extends kns {
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(Cursor cursor) {
        try {
            return lbx.a(((kqh) this.b.b()).a(cursor));
        } catch (JSONException e) {
            kns.a.c("GenoaValuesField", String.format("Invalid JSON %s string array.", new Object[]{this.b}), e);
            return null;
        }
    }

    public knr(lsb lsb, lsb lsb2) {
        super(lsb, lsb2);
    }

    /* access modifiers changed from: protected */
    public final void a(ContentValues contentValues) {
        contentValues.put(((kqh) this.b.b()).a(), lbx.a((Collection) this.c));
    }
}
