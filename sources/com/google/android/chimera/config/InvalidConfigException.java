package com.google.android.chimera.config;

import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class InvalidConfigException extends Exception {
    public InvalidConfigException(String str) {
        super(str);
    }

    public InvalidConfigException(String str, Throwable th) {
        super(str, th);
    }

    public InvalidConfigException(Throwable th) {
        super(th);
    }
}
