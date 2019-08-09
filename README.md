# expanse_technology_example

## Development setup

First off, you require the latest Android Studio 3.0 (or newer) to be able to build the app.
Buildtoolsversion: "29.0.1"

##Clone with HTTPS
Clone with [Git](https://github.com/Jendorski/expanse_technology_example.git), allow the Android Studio to build

### API key

You need to supply API keys for the various services the
app uses. That is currently [Fixer.io](https://fixer.io/documentation). You can find information about
how to gain access via the relevant links.

##Libraries 

The following libraries are in use:

->Retrofit (network Calls)

->Room (DataBase)

->EventBus (Activity -> Fragment interactions, via event driven process on background, main threads)

->SpinKit (Animation loader)

->OkHttp (Network configurations)

->ButterKnife (Easy bindings to widgets)

When the app starts, an animation loads, allowing the rates to be fetched. Conversion is carried as the text is changing
or new currency is selected or the conversion button is clicked upon.

## License

```
Copyright 2017 Google, Inc.

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements. See the NOTICE file distributed with this work for
additional information regarding copyright ownership. The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License. You may obtain a copy of
the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
License for the specific language governing permissions and limitations under
the License.
```
