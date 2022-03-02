package defpackage;

import android.os.AsyncTask;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/* renamed from: mwm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mwm extends AsyncTask {
    final /* synthetic */ File a;
    final /* synthetic */ List b;

    public mwm(File file, List list) {
        this.a = file;
        this.b = list;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.a));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                this.b.add(readLine);
            }
        } catch (IOException e) {
        }
        return (String[]) this.b.toArray(new String[0]);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
    }
}
