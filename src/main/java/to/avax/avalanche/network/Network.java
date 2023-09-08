/*
 *
 * Crypto.bi AvalancheJ - An experimental (unofficial) Java library for interacting with the Avalanche Platform
 * Copyright (C) 2023 AVAXBuildr
 *
 * For more information, visit:
 * https://crypto.bi
 *
 *
 **/

package to.avax.avalanche.network;

import lombok.Data;
import to.avax.avalanche.Avalanche;

import static to.avax.avalanche.helpers.NetworkHelper.createAvalancheProvider;
import static to.avax.avalanche.network.Constants.getDefaultConfig;

@Data
public class Network {
    private static Avalanche avalanche;
    private static NetworkConfig defaultConfig;

    static {
        avalanche = createAvalancheProvider(getDefaultConfig());
    }

    public static Avalanche getAvalanche() {
        return avalanche;
    }
}