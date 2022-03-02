package defpackage;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* renamed from: anj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anj implements ah {
    private final anp a;

    public anj(anp anp) {
        this.a = anp;
    }

    public final void a(aj ajVar, ac acVar) {
        if (acVar == ac.ON_CREATE) {
            ajVar.getLifecycle().b(this);
            ann savedStateRegistry = this.a.getSavedStateRegistry();
            if (savedStateRegistry.c) {
                Bundle bundle = savedStateRegistry.b;
                Bundle bundle2 = null;
                if (bundle != null) {
                    Bundle bundle3 = bundle.getBundle("androidx.savedstate.Restarter");
                    savedStateRegistry.b.remove("androidx.savedstate.Restarter");
                    if (savedStateRegistry.b.isEmpty()) {
                        savedStateRegistry.b = null;
                    }
                    bundle2 = bundle3;
                }
                if (bundle2 != null) {
                    ArrayList<String> stringArrayList = bundle2.getStringArrayList("classes_to_restore");
                    if (stringArrayList != null) {
                        int size = stringArrayList.size();
                        int i = 0;
                        while (i < size) {
                            String str = stringArrayList.get(i);
                            try {
                                Class<? extends U> asSubclass = Class.forName(str, false, anj.class.getClassLoader()).asSubclass(anl.class);
                                try {
                                    Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                                    declaredConstructor.setAccessible(true);
                                    try {
                                        ((anl) declaredConstructor.newInstance(new Object[0])).a();
                                        i++;
                                    } catch (Exception e) {
                                        throw new RuntimeException("Failed to instantiate " + str, e);
                                    }
                                } catch (NoSuchMethodException e2) {
                                    throw new IllegalStateException("Class" + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                                }
                            } catch (ClassNotFoundException e3) {
                                throw new RuntimeException("Class " + str + " wasn't found", e3);
                            }
                        }
                        return;
                    }
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                return;
            }
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
