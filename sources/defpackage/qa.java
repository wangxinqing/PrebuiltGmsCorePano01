package defpackage;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: qa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qa {
    public static final ArrayList a = new ArrayList();
    public WeakHashMap b = null;
    public WeakReference c = null;
    private SparseArray d = null;

    static qa a(View view) {
        qa qaVar = (qa) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (qaVar != null) {
            return qaVar;
        }
        qa qaVar2 = new qa();
        view.setTag(R.id.tag_unhandled_key_event_manager, qaVar2);
        return qaVar2;
    }

    public static final boolean b(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null) {
            return false;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((pz) arrayList.get(size)).a()) {
                return true;
            }
        }
        return false;
    }

    public final SparseArray a() {
        if (this.d == null) {
            this.d = new SparseArray();
        }
        return this.d;
    }

    public final View a(View view, KeyEvent keyEvent) {
        WeakHashMap weakHashMap = this.b;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View a2 = a(viewGroup.getChildAt(childCount), keyEvent);
                if (a2 != null) {
                    return a2;
                }
            }
        }
        if (!b(view)) {
            return null;
        }
        return view;
    }
}
