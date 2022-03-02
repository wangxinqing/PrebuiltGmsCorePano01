package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: gpm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gpm implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ gqa a;

    public gpm(gqa gqa) {
        this.a = gqa;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new gop(this.a.getActivity(), "minute_maid");
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        String str = (String) obj;
        gqa gqa = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
        sb.append("window.setDgResult('");
        sb.append(str);
        sb.append("');");
        gqa.f(sb.toString());
    }

    public final void onLoaderReset(Loader loader) {
    }
}
