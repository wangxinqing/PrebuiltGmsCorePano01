package defpackage;

import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.R;
import com.google.android.gms.feedback.ShowTextChimeraActivity;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/* renamed from: mxk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mxk extends AsyncTask {
    private final String a;
    private final WeakReference b;

    public mxk(String str, ShowTextChimeraActivity showTextChimeraActivity) {
        this.a = str;
        this.b = new WeakReference(showTextChimeraActivity);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        AsyncTask asyncTask;
        Void[] voidArr = (Void[]) objArr;
        ShowTextChimeraActivity showTextChimeraActivity = (ShowTextChimeraActivity) this.b.get();
        if (showTextChimeraActivity == null) {
            return null;
        }
        try {
            File file = new File(new File(showTextChimeraActivity.getFilesDir().getPath(), "reports"), String.valueOf(this.a).concat(".txt"));
            ArrayList arrayList = new ArrayList();
            if (!file.exists() || !file.canRead()) {
                asyncTask = null;
            } else {
                asyncTask = new mwm(file, arrayList).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            }
            if (asyncTask != null) {
                return (String[]) asyncTask.get();
            }
            return null;
        } catch (InterruptedException | ExecutionException e) {
            Log.e("gf_ShowTextActivity", "Failed to read the file.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        ShowTextChimeraActivity showTextChimeraActivity = (ShowTextChimeraActivity) this.b.get();
        if (showTextChimeraActivity != null) {
            showTextChimeraActivity.findViewById(R.id.gf_progress_spinner_for_text).setVisibility(8);
            showTextChimeraActivity.findViewById(R.id.gf_container_for_text).setVisibility(0);
            showTextChimeraActivity.a(strArr);
        }
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        ShowTextChimeraActivity showTextChimeraActivity = (ShowTextChimeraActivity) this.b.get();
        if (showTextChimeraActivity != null) {
            showTextChimeraActivity.findViewById(R.id.gf_progress_spinner_for_text).setVisibility(0);
            showTextChimeraActivity.findViewById(R.id.gf_container_for_text).setVisibility(8);
        }
    }
}
