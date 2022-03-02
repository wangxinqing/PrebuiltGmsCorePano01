package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.io.IoUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertificateException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactorySpi;
import javax.net.ssl.ManagerFactoryParameters;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class KeyManagerFactoryImpl extends KeyManagerFactorySpi {
    private KeyStore keyStore;
    private char[] pwd;

    /* access modifiers changed from: protected */
    public KeyManager[] engineGetKeyManagers() {
        KeyStore keyStore2 = this.keyStore;
        if (keyStore2 != null) {
            return new KeyManager[]{new KeyManagerImpl(keyStore2, this.pwd)};
        }
        throw new IllegalStateException("KeyManagerFactory is not initialized");
    }

    /* access modifiers changed from: protected */
    public void engineInit(KeyStore keyStore2, char[] cArr) {
        if (keyStore2 == null) {
            this.keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            String property = System.getProperty("javax.net.ssl.keyStore");
            FileInputStream fileInputStream = null;
            if (property == null || property.equalsIgnoreCase("NONE") || property.isEmpty()) {
                try {
                    this.keyStore.load((InputStream) null, (char[]) null);
                } catch (IOException e) {
                    throw new KeyStoreException(e);
                } catch (CertificateException e2) {
                    throw new KeyStoreException(e2);
                }
            } else {
                String property2 = System.getProperty("javax.net.ssl.keyStorePassword");
                if (property2 == null) {
                    this.pwd = EmptyArray.CHAR;
                } else {
                    this.pwd = property2.toCharArray();
                }
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(new File(property));
                    try {
                        this.keyStore.load(fileInputStream2, this.pwd);
                        IoUtils.closeQuietly((Closeable) fileInputStream2);
                    } catch (FileNotFoundException e3) {
                        e = e3;
                        FileInputStream fileInputStream3 = fileInputStream2;
                        throw new KeyStoreException(e);
                    } catch (IOException e4) {
                        e = e4;
                        FileInputStream fileInputStream4 = fileInputStream2;
                        throw new KeyStoreException(e);
                    } catch (CertificateException e5) {
                        e = e5;
                        fileInputStream = fileInputStream2;
                        throw new KeyStoreException(e);
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        IoUtils.closeQuietly((Closeable) fileInputStream);
                        throw th;
                    }
                } catch (FileNotFoundException e6) {
                    e = e6;
                    throw new KeyStoreException(e);
                } catch (IOException e7) {
                    e = e7;
                    throw new KeyStoreException(e);
                } catch (CertificateException e8) {
                    e = e8;
                    throw new KeyStoreException(e);
                } catch (Throwable th2) {
                    th = th2;
                    IoUtils.closeQuietly((Closeable) fileInputStream);
                    throw th;
                }
            }
        } else {
            this.keyStore = keyStore2;
            if (cArr != null) {
                this.pwd = (char[]) cArr.clone();
            } else {
                this.pwd = EmptyArray.CHAR;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void engineInit(ManagerFactoryParameters managerFactoryParameters) {
        throw new InvalidAlgorithmParameterException("ManagerFactoryParameters not supported");
    }
}
