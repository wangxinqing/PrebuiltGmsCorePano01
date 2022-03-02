package defpackage;

import android.widget.ListView;
import com.google.android.gms.R;
import com.google.android.gms.feedback.FeedbackChimeraActivity;
import com.google.android.gms.feedback.PreviewChimeraActivity;

/* renamed from: mun  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mun implements Runnable {
    final /* synthetic */ mup a;

    public mun(mup mup) {
        this.a = mup;
    }

    public final void run() {
        mup mup;
        mup mup2 = this.a;
        mwg mwg = FeedbackChimeraActivity.d;
        if (mwg.d()) {
            PreviewChimeraActivity previewChimeraActivity = mup2.b;
            ListView listView = (ListView) previewChimeraActivity.findViewById(R.id.list);
            boolean z = false;
            if (!(listView == null || previewChimeraActivity.b == null || listView.getLastVisiblePosition() != previewChimeraActivity.b.getCount() - 1)) {
                z = true;
            }
            mup2.a.remove(mup2.getCount() - 1);
            mup2.a(mwg.g());
            mup2.notifyDataSetChanged();
            if (z) {
                PreviewChimeraActivity previewChimeraActivity2 = mup2.b;
                ListView listView2 = (ListView) previewChimeraActivity2.findViewById(R.id.list);
                if (listView2 != null && (mup = previewChimeraActivity2.b) != null) {
                    listView2.smoothScrollToPosition(mup.getCount() - 1);
                    return;
                }
                return;
            }
            return;
        }
        mup2.a();
    }
}
