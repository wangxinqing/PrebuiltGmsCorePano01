package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.Service;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: jaz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class jaz extends Service {
    private ArrayList a;
    protected List b;
    protected List c;
    protected jbj d;
    protected aoru e;
    public Set f;
    public Map g;
    public int h;
    private int[] i;

    public jaz(int i2, String str, Set set, int i3, int i4) {
        this(new int[]{i2}, new String[]{str}, set, i3, i4, 1, (Map) null);
    }

    /* access modifiers changed from: protected */
    public abstract void a(jbb jbb, GetServiceRequest getServiceRequest);

    /* access modifiers changed from: protected */
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i2;
        printWriter.println("==== ApiService dumped info ====");
        printWriter.printf("ID: %s\n", new Object[]{Arrays.toString(this.i)});
        printWriter.printf("Action: %s\n", new Object[]{TextUtils.join(",", this.a)});
        printWriter.printf("Visibility: %d\n", new Object[]{Integer.valueOf(this.h)});
        Object[] objArr = new Object[1];
        jbj jbj = this.d;
        synchronized (jbj.b) {
            i2 = jbj.a;
        }
        objArr[0] = Integer.valueOf(i2);
        printWriter.printf("OperationCount: %d\n", objArr);
        printWriter.printf("Executor: %s", new Object[]{this.e.toString()});
    }

    public final IBinder onBind(Intent intent) {
        if (!this.a.contains(intent.getAction())) {
            String valueOf = String.valueOf(intent.getAction());
            Log.w("ApiService", valueOf.length() == 0 ? new String("incompatible service action: ") : "incompatible service action: ".concat(valueOf));
            return null;
        }
        int[] iArr = this.i;
        return new jay(this, this, iArr[0], iArr);
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        jbj jbj = this.d;
        synchronized (jbj.b) {
            if (jbj.a == 0) {
                jbj.d.stopSelf();
            }
        }
        return 2;
    }

    public jaz(int i2, String str, Set set, int i3, aoru aoru, Map map) {
        this(new int[]{i2}, new String[]{str}, set, i3, aoru, map);
    }

    public jaz(int[] iArr, String[] strArr, Set set, int i2, int i3) {
        this(iArr, strArr, set, i2, i3, 1, (Map) null);
    }

    public jaz(int[] iArr, String[] strArr, Set set, int i2, int i3, int i4, Map map) {
        this(iArr, strArr, set, i2, jfb.a(i4, i3), map);
    }

    public jaz(int[] iArr, String[] strArr, Set set, int i2, aoru aoru, Map map) {
        iva.a((Object) iArr);
        boolean z = true;
        iva.b(iArr.length > 0);
        iva.a((Object) strArr);
        iva.b(r0 <= 0 ? false : z);
        for (String c2 : strArr) {
            iva.c(c2);
        }
        this.i = iArr;
        ArrayList arrayList = new ArrayList(strArr.length);
        this.a = arrayList;
        Collections.addAll(arrayList, strArr);
        this.h = i2;
        this.e = aoru;
        this.f = set;
        this.g = map;
        this.d = new jbj(this);
        this.b = amzy.h();
        this.c = amzy.h();
    }
}
