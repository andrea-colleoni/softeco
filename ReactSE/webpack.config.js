var webpack = require("webpack");
var ExtractTextPlugin = require("extract-text-webpack-plugin");

module.exports = {
    entry: __dirname + "/src/index.js",
    output: {
        path: __dirname + "/dist/assets",
        filename: "bundle.js",
        publicPath: "assets"
    },
    devServer: {
        inline: true,
        contentBase: __dirname + "/dist",
        port: 3000
    },
    plugins: [
        new ExtractTextPlugin({
            filename: 'css/style-bundle.css',
            allChunks: true
        })
    ],
    module: {
        loaders: [
            {
                test: /\.js$/,
                exclude: [/node_modules/],
                 use: {
                    loader: 'babel-loader',
                    options: {
                        presets: ['latest', 'stage-0', 'react']
                    }
                }
            },
            {
            test: /\.css$/,
            use: ExtractTextPlugin.extract({
                fallback: 'style-loader',
                use: [{
                loader: 'css-loader', 
                options: {
                sourceMap: true,
                minimize: true,
                importLoaders: 1
                }
                }
                ]
            })
            }
        ]
    }
}