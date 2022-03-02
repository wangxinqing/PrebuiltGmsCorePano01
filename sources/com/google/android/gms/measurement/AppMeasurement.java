package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.internal.InitializationParams;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AppMeasurement {
    private static volatile AppMeasurement a;
    private final svv b;
    private final sxe c;
    private final boolean d;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public final Bundle a() {
            Bundle bundle = new Bundle();
            String str = this.mAppId;
            if (str != null) {
                bundle.putString("app_id", str);
            }
            String str2 = this.mOrigin;
            if (str2 != null) {
                bundle.putString("origin", str2);
            }
            String str3 = this.mName;
            if (str3 != null) {
                bundle.putString("name", str3);
            }
            Object obj = this.mValue;
            if (obj != null) {
                swo.a(bundle, obj);
            }
            String str4 = this.mTriggerEventName;
            if (str4 != null) {
                bundle.putString("trigger_event_name", str4);
            }
            bundle.putLong("trigger_timeout", this.mTriggerTimeout);
            String str5 = this.mTimedOutEventName;
            if (str5 != null) {
                bundle.putString("timed_out_event_name", str5);
            }
            Bundle bundle2 = this.mTimedOutEventParams;
            if (bundle2 != null) {
                bundle.putBundle("timed_out_event_params", bundle2);
            }
            String str6 = this.mTriggeredEventName;
            if (str6 != null) {
                bundle.putString("triggered_event_name", str6);
            }
            Bundle bundle3 = this.mTriggeredEventParams;
            if (bundle3 != null) {
                bundle.putBundle("triggered_event_params", bundle3);
            }
            bundle.putLong("time_to_live", this.mTimeToLive);
            String str7 = this.mExpiredEventName;
            if (str7 != null) {
                bundle.putString("expired_event_name", str7);
            }
            Bundle bundle4 = this.mExpiredEventParams;
            if (bundle4 != null) {
                bundle.putBundle("expired_event_params", bundle4);
            }
            bundle.putLong("creation_timestamp", this.mCreationTimestamp);
            bundle.putBoolean("active", this.mActive);
            bundle.putLong("triggered_timestamp", this.mTriggeredTimestamp);
            return bundle;
        }

        public ConditionalUserProperty(Bundle bundle) {
            iva.a((Object) bundle);
            this.mAppId = (String) swo.a(bundle, "app_id", String.class, (Object) null);
            this.mOrigin = (String) swo.a(bundle, "origin", String.class, (Object) null);
            this.mName = (String) swo.a(bundle, "name", String.class, (Object) null);
            this.mValue = swo.a(bundle, "value", Object.class, (Object) null);
            this.mTriggerEventName = (String) swo.a(bundle, "trigger_event_name", String.class, (Object) null);
            this.mTriggerTimeout = ((Long) swo.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) swo.a(bundle, "timed_out_event_name", String.class, (Object) null);
            this.mTimedOutEventParams = (Bundle) swo.a(bundle, "timed_out_event_params", Bundle.class, (Object) null);
            this.mTriggeredEventName = (String) swo.a(bundle, "triggered_event_name", String.class, (Object) null);
            this.mTriggeredEventParams = (Bundle) swo.a(bundle, "triggered_event_params", Bundle.class, (Object) null);
            this.mTimeToLive = ((Long) swo.a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) swo.a(bundle, "expired_event_name", String.class, (Object) null);
            this.mExpiredEventParams = (Bundle) swo.a(bundle, "expired_event_params", Bundle.class, (Object) null);
        }
    }

    public AppMeasurement(svv svv) {
        iva.a((Object) svv);
        this.b = svv;
        this.c = null;
        this.d = false;
    }

    public void beginAdUnitExposure(String str) {
        if (!this.d) {
            sor o = this.b.o();
            jiq jiq = this.b.l;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (str == null || str.length() == 0) {
                o.E().c.a("Ad unit id must be a non-empty string");
            } else {
                o.F().a((Runnable) new soo(o, str, elapsedRealtime));
            }
        } else {
            this.c.f();
        }
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (!this.d) {
            sxd e = this.b.e();
            e.i();
            e.a((String) null, str, str2, bundle);
            return;
        }
        this.c.g();
    }

    /* access modifiers changed from: protected */
    public void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        if (!this.d) {
            sxd e = this.b.e();
            iva.c(str);
            e.j();
            e.a(str, str2, str3, bundle);
            return;
        }
        throw new IllegalStateException("Unexpected call on client side");
    }

    public void endAdUnitExposure(String str) {
        if (!this.d) {
            sor o = this.b.o();
            jiq jiq = this.b.l;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (str == null || str.length() == 0) {
                o.E().c.a("Ad unit id must be a non-empty string");
            } else {
                o.F().a((Runnable) new sop(o, str, elapsedRealtime));
            }
        } else {
            this.c.h();
        }
    }

    public long generateEventId() {
        if (!this.d) {
            return this.b.f().d();
        }
        return this.c.e();
    }

    public String getAppInstanceId() {
        if (this.d) {
            return this.c.c();
        }
        sxd e = this.b.e();
        e.i();
        return (String) e.c.get();
    }

    public List getConditionalUserProperties(String str, String str2) {
        List<Bundle> list;
        int i;
        if (!this.d) {
            sxd e = this.b.e();
            e.i();
            list = e.a((String) null, str, str2);
        } else {
            list = this.c.i();
        }
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        ArrayList arrayList = new ArrayList(i);
        for (Bundle conditionalUserProperty : list) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public List getConditionalUserPropertiesAs(String str, String str2, String str3) {
        if (!this.d) {
            sxd e = this.b.e();
            iva.c(str);
            e.j();
            ArrayList a2 = e.a(str, str2, str3);
            ArrayList arrayList = new ArrayList(a2.size());
            int size = a2.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new ConditionalUserProperty((Bundle) a2.get(i)));
            }
            return arrayList;
        }
        throw new IllegalStateException("Unexpected call on client side");
    }

    public String getCurrentScreenClass() {
        if (this.d) {
            return this.c.b();
        }
        sxk p = this.b.e().x.k().p();
        if (p != null) {
            return p.b;
        }
        return null;
    }

    public String getCurrentScreenName() {
        if (this.d) {
            return this.c.a();
        }
        sxk p = this.b.e().x.k().p();
        if (p != null) {
            return p.a;
        }
        return null;
    }

    public String getGmpAppId() {
        if (this.d) {
            return this.c.d();
        }
        sxd e = this.b.e();
        String str = e.x.b;
        if (str != null) {
            return str;
        }
        try {
            return ifr.a();
        } catch (IllegalStateException e2) {
            e.x.E().c.a("getGoogleAppId failed with exception", e2);
            return null;
        }
    }

    public int getMaxUserProperties(String str) {
        if (this.d) {
            return this.c.j();
        }
        sxd e = this.b.e();
        iva.c(str);
        e.v();
        return 25;
    }

    /* access modifiers changed from: protected */
    public Map getUserProperties(String str, String str2, boolean z) {
        if (this.d) {
            return this.c.k();
        }
        sxd e = this.b.e();
        e.i();
        return e.a((String) null, str, str2, z);
    }

    /* access modifiers changed from: protected */
    public Map getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        if (!this.d) {
            sxd e = this.b.e();
            iva.c(str);
            e.j();
            return e.a(str, str2, str3, z);
        }
        throw new IllegalStateException("Unexpected call on client side");
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        if (!this.d) {
            this.b.e().a(str, str2, bundle);
        } else {
            this.c.l();
        }
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        iva.a((Object) conditionalUserProperty);
        if (!this.d) {
            sxd e = this.b.e();
            Bundle a2 = conditionalUserProperty.a();
            long a3 = e.A().a();
            iva.a((Object) a2);
            e.i();
            Bundle bundle = new Bundle(a2);
            if (!TextUtils.isEmpty(bundle.getString("app_id"))) {
                e.E().f.a("Package name should be null when calling setConditionalUserProperty");
            }
            bundle.remove("app_id");
            e.a(bundle, a3);
            return;
        }
        sxe sxe = this.c;
        conditionalUserProperty.a();
        sxe.m();
    }

    /* access modifiers changed from: protected */
    public void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        iva.a((Object) conditionalUserProperty);
        if (!this.d) {
            sxd e = this.b.e();
            Bundle a2 = conditionalUserProperty.a();
            iva.a((Object) a2);
            iva.c(a2.getString("app_id"));
            e.j();
            e.a(new Bundle(a2), e.A().a());
            return;
        }
        throw new IllegalStateException("Unexpected call on client side");
    }

    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        spc.a(context);
        if (a == null) {
            synchronized (AppMeasurement.class) {
                if (a == null) {
                    sxe sxe = null;
                    if (!spc.a(context)) {
                        try {
                            try {
                                sxe = (sxe) Class.forName("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("getScionFrontendApiImplementation", new Class[]{Context.class, Bundle.class}).invoke((Object) null, new Object[]{context, null});
                            } catch (Exception e) {
                            }
                        } catch (ClassNotFoundException e2) {
                        }
                    }
                    if (sxe == null) {
                        a = new AppMeasurement(svv.a(context, new InitializationParams(0, 0, true, (String) null, (String) null, (String) null, (Bundle) null)));
                    } else {
                        a = new AppMeasurement(sxe);
                    }
                }
            }
        }
        return a;
    }

    public AppMeasurement(sxe sxe) {
        iva.a((Object) sxe);
        this.c = sxe;
        this.b = null;
        this.d = true;
    }
}
