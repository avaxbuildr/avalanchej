/*
 *
 * Crypto.bi AvalancheJ - An experimental (unofficial) Java library for interacting with the Avalanche Platform
 * Copyright (C) 2023 REKTBuildr
 *
 * For more information, visit:
 * https://crypto.bi
 *
 *
 **/

package to.avax.avalanche.utils;

import org.bitcoinj.core.Base58;
import org.bitcoinj.core.Bech32;
import to.avax.avalanche.wallet.Types;

import java.util.Base64;

public class BinTools {

    final private static BinTools instance;

    static {
        instance = new BinTools();
    }

    private BinTools(){
    }

    public static BinTools getInstance() {
        return instance;
    }

    public static String addressToString(String hrp, Types.ChainAlias chainId, byte[] addrBuf) {
        byte[] b8t5 = AvaxtoBech32.encode8to5(addrBuf);
        String addr = Bech32.encode(Bech32.Encoding.BECH32, hrp, b8t5);
        return String.format("%s-%s", chainId, addr);
    }
    public static String bytesToHex(byte[] input) {
        StringBuilder sb = new StringBuilder(input.length * 2);
        for(byte b: input) {
            sb.append(String.format("%02x", b));
        }

        return sb.toString();
    }

    /**
     * Returns true if base64, otherwise false
     * @param str the string to verify is Base64
     */
    public static boolean isBase64(String str) {
        if (str.isEmpty() || str.trim().isEmpty()) {
            return false;
        }
        try {
            byte[] b64 = Base64.getDecoder().decode(str);
            byte[] r64 = Base64.getEncoder().encode(b64);
            return new String(r64).equals(str);
        } catch (Throwable t) {
            return false;
        }
    }

    /**
     * Returns true if cb58, otherwise false
     * @param cb58 the string to verify is cb58
     */
    public static boolean isCB58(String cb58) {
        return isBase58(cb58);
    }

    /**
     * Returns true if base58, otherwise false
     * @param base58 the string to verify is base58
     */
    public static boolean isBase58(String base58) {
        BinTools bt = getInstance();
        if (base58.isEmpty() || base58.trim().isEmpty()) {
            return false;
        }
        try {
            return Base58.encode(Base58.decode(base58)).equals(base58);
        } catch (Throwable t) {
            return false;
        }
    }


}