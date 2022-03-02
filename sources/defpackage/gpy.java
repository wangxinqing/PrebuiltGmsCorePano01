package defpackage;

import android.os.AsyncTask;
import java.io.IOException;

/* renamed from: gpy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gpy extends AsyncTask {
    private final gpt a;

    public gpy(gpt gpt) {
        this.a = gpt;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        try {
            return qdc.a(this.a.a.getActivity().getApplicationContext()).a(((String[]) objArr)[0], "GCM");
        } catch (IOException e) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        gpt gpt = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
        sb.append("window.setIIDToken('");
        sb.append(str);
        sb.append("');");
        gpt.a.f(sb.toString());
    }
}
