package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aryi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aryi extends bhw implements aryj {
    public final Handler a;
    public WeakReference b;
    private final WeakReference c;
    private final String d;

    public aryi() {
        super("com.google.location.nearby.common.fastpair.autotest.IAutoTestServiceCallback");
    }

    private final View a(String str) {
        Object obj;
        Context context = (Context) this.c.get();
        if (context == null) {
            Log.w("AutoTestUiInjector", "Error! getViewFromFragment failed because context is null!");
            return null;
        }
        WeakReference weakReference = this.b;
        if (weakReference != null) {
            obj = weakReference.get();
        } else {
            obj = null;
        }
        if (obj == null) {
            Log.w("AutoTestUiInjector", "Error! getViewFromFragment failed because targetFragment is null!");
            return null;
        }
        Method a2 = a(obj, "getView");
        if (a2 == null) {
            Log.w("AutoTestUiInjector", "Error! Find Fragment.getView failed!");
            return null;
        }
        int identifier = context.getResources().getIdentifier(str, "id", this.d);
        if (identifier <= 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
            sb.append("Error! Can't find id: ");
            sb.append(str);
            sb.append("!");
            Log.w("AutoTestUiInjector", sb.toString());
            return null;
        }
        try {
            return ((View) a2.invoke(obj, new Object[0])).findViewById(identifier);
        } catch (IllegalAccessException | InvocationTargetException e) {
            Log.w("AutoTestUiInjector", "Error! Meet exception when calling getViewFromFragment!", e);
            return null;
        }
    }

    public aryi(WeakReference weakReference, String str) {
        super("com.google.location.nearby.common.fastpair.autotest.IAutoTestServiceCallback");
        this.c = weakReference;
        this.d = str;
        this.a = new Handler(Looper.getMainLooper());
    }

    private static Method a(Object obj, String str) {
        for (Method method : obj.getClass().getMethods()) {
            if (str.equals(method.getName())) {
                return method;
            }
        }
        return null;
    }

    public static boolean a(RecyclerView recyclerView) {
        if (recyclerView.getChildCount() <= 0) {
            return false;
        }
        if (recyclerView.getChildCount() == 1) {
            return recyclerView.getChildAt(0).isClickable();
        }
        return true;
    }

    public final void a(RecyclerView recyclerView, String str, String str2) {
        int i;
        Context context = (Context) this.c.get();
        if (context == null) {
            Log.w("AutoTestUiInjector", "Error! clickItemOnRecyclerView failed because context is null!");
            return;
        }
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            i = context.getResources().getIdentifier(str, "id", this.d);
        }
        if (i <= 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 49);
            sb.append("Error! Can't find id: ");
            sb.append(str);
            sb.append(" for recyclerViewItemTitle!");
            Log.w("AutoTestUiInjector", sb.toString());
            return;
        }
        int childCount = recyclerView.getChildCount();
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("Check adapter with item count ");
        sb2.append(childCount);
        Log.w("AutoTestUiInjector", sb2.toString());
        for (int i2 = 0; i2 < recyclerView.getChildCount(); i2++) {
            View childAt = recyclerView.getChildAt(i2);
            TextView textView = (TextView) childAt.findViewById(i);
            if (textView == null) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 50);
                sb3.append("Doesn't find view with id ");
                sb3.append(str);
                sb3.append(" from recycle view item!");
                Log.w("AutoTestUiInjector", sb3.toString());
            } else if (str2.contentEquals(textView.getText())) {
                childAt.performClick();
                String valueOf = String.valueOf(str2);
                Log.w("AutoTestUiInjector", valueOf.length() == 0 ? new String("Find item with name: ") : "Find item with name: ".concat(valueOf));
                return;
            }
        }
        String valueOf2 = String.valueOf(str2);
        Log.w("AutoTestUiInjector", valueOf2.length() == 0 ? new String("Error! Don't find any item with name: ") : "Error! Don't find any item with name: ".concat(valueOf2));
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        boolean z = false;
        if (i == 2) {
            String readString = parcel.readString();
            View a2 = a(readString);
            if (a2 == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(readString).length() + 32);
                sb.append("Error! Can't find view for id: ");
                sb.append(readString);
                sb.append("!");
                Log.w("AutoTestUiInjector", sb.toString());
            } else {
                this.a.post(new arwo(a2));
                z = true;
            }
            parcel2.writeNoException();
            bhx.a(parcel2, z);
        } else if (i == 3) {
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            RecyclerView recyclerView = (RecyclerView) a(readString2);
            if (recyclerView == null) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(readString2).length() + 32);
                sb2.append("Error! Can't find view for id: ");
                sb2.append(readString2);
                sb2.append("!");
                Log.w("AutoTestUiInjector", sb2.toString());
            } else {
                this.a.post(new arwp(this, recyclerView, readString3, readString4, recyclerView.getAdapter()));
                z = true;
            }
            parcel2.writeNoException();
            bhx.a(parcel2, z);
        } else if (i == 4) {
            Context context = (Context) this.c.get();
            if (context == null) {
                Log.w("AutoTestUiInjector", "Error! clickItemOnRecyclerView failed because context is null!");
            } else {
                Method a3 = a((Object) context, "finish");
                if (a3 == null) {
                    Log.w("AutoTestUiInjector", "Error! Find Activity.finish failed!");
                } else {
                    try {
                        a3.invoke(context, new Object[0]);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        Log.w("AutoTestUiInjector", "Error! Meet exception when calling Activity.finish!", e);
                    }
                }
            }
            parcel2.writeNoException();
        } else if (i != 5) {
            return false;
        } else {
            boolean a4 = a(parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            bhx.a(parcel2, a4);
        }
        return true;
    }

    public final boolean a(String str, String str2) {
        Method method;
        WeakReference weakReference = this.b;
        Object obj = weakReference != null ? weakReference.get() : null;
        if (obj == null) {
            Log.w("AutoTestUiInjector", "Error! invokeStringMethod failed because targetFragment is null!");
            return false;
        }
        Method a2 = a(obj, str);
        if (a2 == null) {
            try {
                method = obj.getClass().getDeclaredMethod(str, new Class[]{String.class});
            } catch (NoSuchMethodException e) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 27);
                sb.append("Error! Find method ");
                sb.append(str);
                sb.append(" failed!");
                Log.w("AutoTestUiInjector", sb.toString());
                return false;
            }
        } else {
            method = a2;
        }
        method.setAccessible(true);
        aosh f = aosh.f();
        this.a.post(new arwq(method, obj, str2, f, str));
        try {
            return ((Boolean) f.get(15000, TimeUnit.MICROSECONDS)).booleanValue();
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            return false;
        }
    }
}
