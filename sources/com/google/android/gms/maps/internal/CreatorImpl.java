package com.google.android.gms.maps.internal;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CreatorImpl extends rse {
    public rsf a = null;
    private int b = -1;
    private Set c = Collections.newSetFromMap(new WeakHashMap());

    private static Object a(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            RemoteException remoteException = new RemoteException();
            remoteException.initCause(e);
            throw remoteException;
        } catch (InstantiationException e2) {
            RemoteException remoteException2 = new RemoteException();
            remoteException2.initCause(e2);
            throw remoteException2;
        }
    }

    public void init(mby mby) {
        initV2(mby, 0);
    }

    public void initV2(mby mby, int i) {
        this.b = i;
    }

    public rvu newBitmapDescriptorFactoryDelegate() {
        return new rvt(this);
    }

    public rsb newCameraUpdateFactoryDelegate() {
        return new rsa(this);
    }

    public rsp newMapFragmentDelegate(mby mby) {
        a((Context) (Activity) mbz.a(mby));
        rsf rsf = this.a;
        if (rsf == null) {
            return new rso((Context) mbz.a(mby));
        }
        return rsf.newMapFragmentDelegate(mby);
    }

    public rss newMapViewDelegate(mby mby, GoogleMapOptions googleMapOptions) {
        a(((Context) mbz.a(mby)).getApplicationContext());
        rsf rsf = this.a;
        if (rsf == null) {
            return new rsr((Context) mbz.a(mby));
        }
        return rsf.newMapViewDelegate(mby, googleMapOptions);
    }

    public rum newStreetViewPanoramaFragmentDelegate(mby mby) {
        a((Context) (Activity) mbz.a(mby));
        rsf rsf = this.a;
        if (rsf == null) {
            return new rul((Context) mbz.a(mby));
        }
        return rsf.newStreetViewPanoramaFragmentDelegate(mby);
    }

    public rup newStreetViewPanoramaViewDelegate(mby mby, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        a(((Context) mbz.a(mby)).getApplicationContext());
        rsf rsf = this.a;
        if (rsf == null) {
            return new ruo((Context) mbz.a(mby));
        }
        return rsf.newStreetViewPanoramaViewDelegate(mby, streetViewPanoramaOptions);
    }

    private final void a(Context context) {
        if (this.a == null) {
            try {
                Context a2 = hep.a(context, "com.google.android.gms.maps_dynamite");
                if (a2 != null) {
                    ClassLoader classLoader = a2.getClassLoader();
                    Resources resources = a2.getResources();
                    rsf asInterface = rse.asInterface((IBinder) a((Class) classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl")));
                    this.a = asInterface;
                    asInterface.initV2(mbz.a((Object) resources), this.b);
                    for (rry rry : this.c) {
                        Object obj = rry.a;
                        if (obj instanceof rrx) {
                            rry.a = ((rrx) obj).a();
                        }
                    }
                    this.c.clear();
                    return;
                }
                throw new RemoteException();
            } catch (ClassNotFoundException e) {
                RemoteException remoteException = new RemoteException();
                remoteException.initCause(e);
                throw remoteException;
            } catch (RemoteException e2) {
            }
        }
    }

    public final mby a(rrx rrx) {
        if (this.a != null) {
            return mbz.a(rrx.a());
        }
        rry rry = new rry(rrx);
        this.c.add(rry);
        return rry;
    }
}
