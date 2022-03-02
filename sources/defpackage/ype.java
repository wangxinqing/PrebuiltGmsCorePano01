package defpackage;

import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import com.google.android.chimera.CursorLoader;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: ype  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ype implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ ypj a;

    public ype(ypj ypj) {
        this.a = ypj;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new CursorLoader(this.a.getActivity(), ContactsContract.CommonDataKinds.Email.CONTENT_URI, yoq.b, "account_name = ?", new String[]{this.a.j}, "starred DESC,times_contacted DESC,last_time_contacted DESC");
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor != null) {
            yoy yoy = (yoy) this.a.getListAdapter();
            int i = this.a.i;
            yoy.q = cursor;
            yoy.s = i;
            yoy.z = yoy.a(yoy.r, yoy.q);
            yoy.g();
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
