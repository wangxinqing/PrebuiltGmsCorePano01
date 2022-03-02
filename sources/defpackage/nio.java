package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.BoundService;
import com.google.android.gms.common.apiservice.ILifecycleSynchronizerRequired;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: nio  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class nio extends BoundService implements ILifecycleSynchronizerRequired {
    private ArrayList a;
    protected List c;
    protected List d;
    public LifecycleSynchronizer e;
    public aoru f;
    public Set g;
    public Map h;
    public int[] i;
    public int j;

    public nio(int i2, String str, Set set, int i3, int i4) {
        this(new int[]{i2}, new String[]{str}, set, i3, i4, 1, (Map) null);
    }

    /* access modifiers changed from: protected */
    public abstract void a(nit nit, GetServiceRequest getServiceRequest);

    /* access modifiers changed from: protected */
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.println("==== ApiService dumped info ====");
        printWriter.printf("ID: %s\n", new Object[]{Arrays.toString(this.i)});
        printWriter.printf("Action: %s\n", new Object[]{TextUtils.join(",", this.a)});
        printWriter.printf("Visibility: %d\n", new Object[]{Integer.valueOf(this.j)});
        printWriter.printf("OperationCount: %d\n", new Object[]{Integer.valueOf(this.e.getRefCount())});
        printWriter.printf("Executor: %s", new Object[]{this.f.toString()});
    }

    public IBinder onBind(Intent intent) {
        if (!this.a.contains(intent.getAction())) {
            String valueOf = String.valueOf(intent.getAction());
            Log.w("ApiService", valueOf.length() == 0 ? new String("incompatible service action: ") : "incompatible service action: ".concat(valueOf));
            return null;
        } else if (Build.VERSION.SDK_INT <= Build.VERSION.SDK_INT) {
            int[] iArr = this.i;
            return new nin(this, this, iArr[0], iArr);
        } else {
            int i2 = Build.VERSION.SDK_INT;
            StringBuilder sb = new StringBuilder(57);
            sb.append("This API is no longer supported on API level: ");
            sb.append(i2);
            Log.w("ApiService", sb.toString());
            return null;
        }
    }

    public final void setLifecycleSynchronizer(LifecycleSynchronizer lifecycleSynchronizer) {
        this.e = lifecycleSynchronizer;
    }

    public nio(int[] iArr, String[] strArr, Set set, int i2, int i3) {
        this(iArr, strArr, set, i2, i3, 1, (Map) null);
    }

    public nio(int[] iArr, String[] strArr, Set set, int i2, int i3, int i4, Map map) {
        this(iArr, strArr, set, i2, jfb.a(i4, i3), map);
    }

    public nio(int[] iArr, String[] strArr, Set set, int i2, aoru aoru, Map map) {
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
        this.j = i2;
        this.f = aoru;
        this.g = set;
        this.h = map;
        this.c = amzy.h();
        this.d = amzy.h();
    }
}
